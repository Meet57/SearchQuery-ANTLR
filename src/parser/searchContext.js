class searchContext {
  _data = null;
  _error = null;
  _suggestions = null;

  getData() {
    return this._data;
  }

  setData(data) {
    this._data = data;
  }

  getError() {
    return this._error;
  }

  setError(data) {
    this._error = data;
  }

  getSuggestions() {
    return this._suggestions;
  }

  setSuggestions(data) {
    this._suggestions = data;
  }
}

const SearchContext = new searchContext();

export default SearchContext;
